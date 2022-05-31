package eu.knitter.invoicespringmvc21022022;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class InvoiceController {

    private final InvoiceServiceInterface invoiceServiceInterface;

    public InvoiceController(InvoiceServiceInterface invoiceServiceInterface){
        this.invoiceServiceInterface = invoiceServiceInterface;
    }

    @GetMapping
    public String getAllInvoices(Model model){
        List<Invoice> allInvoices = invoiceServiceInterface.getAllInvoices();
        model.addAttribute("allInvoices", allInvoices);
        return "gui";
    }

    @PostMapping("/save")
    public String saveInvoice(@ModelAttribute Invoice invoice) {
        invoiceServiceInterface.saveInvoice(invoice);
        return "redirect:/";
    }
}
