package fr.lernejo.travelsite;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
@RestController
public class Controller {

    private final ArrayList<Travel> cont = new ArrayList<>();
    private final ArrayList<Inscription> insq = new ArrayList<>();
    //Catalog_country catalog_country=new Catalog_country();
    @GetMapping("/api/travels")
    public ArrayList<Travel> getList() {
        cont.add(new Travel("Caribbean", 32.4));
        cont.add(new Travel("Australia", 35.1));
        return cont;
    }

    @PostMapping("api/inscription")
    public void add(@RequestBody Inscription myinsc) {
        this.insq.add(myinsc);
    }




}
