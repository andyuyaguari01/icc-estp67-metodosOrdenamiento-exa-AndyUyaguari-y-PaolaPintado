package controllers;

import models.Brand;

public class BrandController {

    public Brand[] sortSelectionDesc( Brand[] brands){

        for( int i = 0; i< brands.length - 1; i++){
            boolean swap = false;
            for( int j= 0; j< brands.length -1 -i; j++){
                if(brands[j].getTotalValid() < brands[j+1].getTotalValid()){
                    Brand aux = brands[j];
                    brands[j] = brands[j+1];
                    brands[j+1] = aux;

                    swap = true;
                }

            }
            if(! swap){
                break;
            }

        }
        


    }

}
