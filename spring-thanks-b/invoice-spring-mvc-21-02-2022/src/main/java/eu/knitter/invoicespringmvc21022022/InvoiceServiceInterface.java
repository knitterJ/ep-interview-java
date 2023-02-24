package eu.knitter.invoicespringmvc21022022;

import java.util.List;

public interface InvoiceServiceInterface {

    List<Invoice> getAllInvoices();
    void saveInvoice(Invoice invoice);
    void updateInvoice(Invoice newInvoice);
    void deleteInvoice(Long id);
}
