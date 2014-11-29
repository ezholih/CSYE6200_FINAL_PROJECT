/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.MedicalDevice;

import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class MDProductCatalog {
    
    private ArrayList<MedicalDeviceProduct> mdProductList;

    public MDProductCatalog() {
        mdProductList = new ArrayList<>();
    }

    public ArrayList<MedicalDeviceProduct> getMdProductList() {
        return mdProductList;
    }
    
    public MedicalDeviceProduct addProduct(){
        MedicalDeviceProduct mdPord = new MedicalDeviceProduct();
        mdProductList.add(mdPord);
        return mdPord;
    }
    
    public void delProduct(MedicalDeviceProduct mdProd){
        mdProductList.remove(mdProd);
    }
    
}
