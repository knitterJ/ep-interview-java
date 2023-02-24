package eu.knitter.invoicespringmvc21022022;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceServiceInterface {
    private final List<Invoice> invoiceList;

    public InvoiceServiceImpl(List<Invoice> invoiceList){
        this.invoiceList = invoiceList;
        Invoice invoice1 = new Invoice();
        invoice1.setId(1L); // long requires L
        invoice1.setName("One Flew Over the Cuckoo's Nest");
        invoice1.setDate(LocalDate.of(1962, 10, 10));
        invoice1.setPrice(BigDecimal.valueOf(20));
        invoiceList.add(invoice1);

        Invoice invoice2 = new Invoice();
        invoice2.setId(2L);
        invoice2.setName("De Meeste Mensen Deugen");
        invoice2.setDate(LocalDate.of(2019,9,1));
        invoice2.setPrice(BigDecimal.valueOf(100));
        invoiceList.add(invoice2);

    }

    @Override
    public List<Invoice> getAllInvoices() {
        return invoiceList;
    }

    @Override
    public void saveInvoice(Invoice invoice) {
        invoiceList.add(invoice);
    }

    @Override
    public void updateInvoice(Invoice newInvoice) {
        Invoice oldInvoice = invoiceList.stream().filter(element -> element.getId().equals(newInvoice.getId())).findFirst().get();
        int index = invoiceList.indexOf(oldInvoice);
        invoiceList.set(index, newInvoice);
    }

    @Override
    public void deleteInvoice(Long id) {
        invoiceList.removeIf(element -> element.getId().equals(id));
    }
}
