package com.hillel.hrebeniev.homeworks.homework_27_client;

import com.hillel.hrebeniev.homeworks.homework_14.cofee.order.Order;
import com.hillel.hrebeniev.homeworks.homework_20.Product;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the edu.hillel.client.generated package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {
    private final static QName _Add_QNAME = new QName("http://service.hillel.edu/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://service.hillel.edu/", "addResponse");
    private final static QName _GetAll_QNAME = new QName("http://service.hillel.edu/", "getAll");
    private final static QName _GetAllResponse_QNAME = new QName("http://service.hillel.edu/", "getAllResponse");
    private final static QName _GetById_QNAME = new QName("http://service.hillel.edu/", "getById");
    private final static QName _GetByIdResponse_QNAME = new QName("http://service.hillel.edu/", "getByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.hillel.client.generated
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link GetAll }
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link GetById }
     */
    public GetById createGetById() {
        return new GetById();
    }

    /**
     * Create an instance of {@link GetByIdResponse }
     */
    public GetByIdResponse createGetByIdResponse() {
        return new GetByIdResponse();
    }

    /**
     * Create an instance of {@link Order }
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Product }
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.hillel.edu/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.hillel.edu/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.hillel.edu/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.hillel.edu/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetById }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetById }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.hillel.edu/", name = "getById")
    public JAXBElement<GetById> createGetById(GetById value) {
        return new JAXBElement<GetById>(_GetById_QNAME, GetById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.hillel.edu/", name = "getByIdResponse")
    public JAXBElement<GetByIdResponse> createGetByIdResponse(GetByIdResponse value) {
        return new JAXBElement<GetByIdResponse>(_GetByIdResponse_QNAME, GetByIdResponse.class, null, value);
    }

}