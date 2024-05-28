/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class lowPriorityConcreteCreator implements RequestCreator{

    @Override
    public RequestProduct createRequestProduct() {
        return new lowPriorityConcrete();
    }

    @Override
    public void processRequest() {
        RequestProduct lowPriorityRequestProduct = createRequestProduct();
        lowPriorityRequestProduct.processRequest();
    }

   
}
