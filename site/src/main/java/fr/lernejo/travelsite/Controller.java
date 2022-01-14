package fr.lernejo.travelsite;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
@RestController
public class Controller {

    private final ArrayList<Country> countries = new ArrayList<>();
    private final ArrayList<Inscription> insq = new ArrayList<>();
    //Catalog_country catalog_country=new Catalog_country();
    @GetMapping("/api/travels")
    public ArrayList<Country> getList() {
        countries.add(new Country("Caribbean", 32.4));
        countries.add(new Country("Australia", 35.1));
        return countries;
    }

    @PostMapping("api/inscription")
    public void add(@RequestBody Inscription myinscription) {
        this.insq.add(myinscription);
    }


    @GetMapping("/api/inscription")
    public ArrayList<Inscription> getList2() {
        return insq;
    }



}
