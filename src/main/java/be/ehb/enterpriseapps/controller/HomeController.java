package be.ehb.enterpriseapps.controller;

import be.ehb.enterpriseapps.model.ContactMessage;
import be.ehb.enterpriseapps.model.Event;
import be.ehb.enterpriseapps.service.MailService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private final List<Event> events = new ArrayList<>();

    private final MailService mailService;

    public HomeController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/")
    public String index(Model model) {

        List<Event> laatsteEvents;

        if (events.size() > 10) {
            laatsteEvents = events.subList(
                    events.size() - 10,
                    events.size()
            );
        } else {
            laatsteEvents = events;
        }

        model.addAttribute("events", laatsteEvents);

        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {

        model.addAttribute(
                "contactMessage",
                new ContactMessage()
        );

        return "contact";
    }

    @PostMapping("/contact")
    public String sendContact(
            @Valid @ModelAttribute("contactMessage")
            ContactMessage contactMessage,
            BindingResult result) {

        if (result.hasErrors()) {
            return "contact";
        }

        mailService.sendMail(
                contactMessage.getNaam(),
                contactMessage.getEmail(),
                contactMessage.getBericht()
        );

        return "redirect:/contact";
    }

    @GetMapping("/details/{id}")
    public String details(
            @PathVariable int id,
            Model model) {

        Event event = events.get(id);

        model.addAttribute("event", event);

        return "details";
    }

    @GetMapping("/new")
    public String newEvent(Model model) {

        model.addAttribute(
                "event",
                new Event()
        );

        return "new";
    }

    @PostMapping("/new")
    public String saveEvent(
            @Valid @ModelAttribute("event")
            Event event,
            BindingResult result) {

        if (result.hasErrors()) {
            return "new";
        }

        events.add(event);

        return "redirect:/";
    }
}