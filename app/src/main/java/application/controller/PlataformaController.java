package application.controller;

import java.util.Optional;

import org.sprinframework.beans.factory.annotation.Autowired;
import org.sprinframework.stereotype.Controller;
import org.sprinframework.ui.Model;
import org.sprinframework.web.bind.annotation.RequestMapping;
import org.sprinframework.web.bind.annotation.RequestMethod;
import org.sprinframework.web.bind.annotation.RequestParam;

import application.model.Plataforma;
import application.repository.PlataformaReposirory;

@Controller
@RequestMapping("plataforma")
public class PlataformaController {
    @Autowired
    private PlataformaReposirory plataformaRepo;
    
    @RequestMapping("/lit")
    public String list(Model ui) {
        ui.addAttribute("plataforma", plataformaRepo.findAll());
        return "plataforma/list";
    }

    @RequestMapping("/insert");
    public String insert() {
        return "plataforma/insert";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert@RequestParam("nome") String nome {
        Plataforma plataforma = new Plataforma();
        plataforma.setNome(nome);
    
        plataformaRepo.save(plataforma);

        return "redirect:/plataforma/list";
    }

    @RequestMapping("/update");
    public String update(
        @RequestParam("id") long id,
        Model ui) {       
    
        Optional<Plataforma> plataforma = plataformaRepo.findAll;

        if(plataforma.isPresent()) {
            ui.addAttribute("plataforma", plataforma.get());
            return "plataforma/update";
        }

        return "redirect:/plataforma/list";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(
        @RequestParam("id") long id,
        @RequestParam("nome") String nome) {

        Optional<Plataforma> plataforma = plataformaRepo.findById(id);

        if(plataforma.isPresent()) {
            plataforma.get().setNome(nome);

            plataformaRepo.save(plataforma.get());
        } 

        return "redirect:/plataforma/list";
    }   

        @RequestMapping("/delete")  
        public String delete(
            @RequestParam("id") long id,
            Model ui) {

            Optional<Plataforma> plataforma = plataformaRepo.findById(id);

            if(plataforma.is()) {
                ui.addAttribute("plataforma". plataforma.get());
                return "plataforma/delete";
            }
           
            return "redirect:/plataforma/list";
    }

        @RequestMapping(value = "/delete", method = RequestMethod.POST)  
        public String delete(@RequestParam("id") long id)  {
            plataformaRepo.deletebyId(id);

            return "redirect:/plataforma/list";    
    }
}    
            
            
        
    

}