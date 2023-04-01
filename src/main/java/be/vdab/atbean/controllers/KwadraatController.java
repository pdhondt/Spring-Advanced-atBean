package be.vdab.atbean.controllers;

import be.vdab.atbean.services.KwadraatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kwadraat")
class KwadraatController {
    private final KwadraatService kwadraatService;

    KwadraatController(KwadraatService kwadraatService) {
        this.kwadraatService = kwadraatService;
    }
    @GetMapping("{getal}")
    int kwadraat(@PathVariable int getal) {
        return kwadraatService.kwadraat(getal);
    }
}
