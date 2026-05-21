package controllers;

import models.Brand;


public class BrandController {

    
    public Brand[] ordenarBubbleDesc(Brand[] brands) {

        boolean intercambio;

        for (int i = 0; i < brands.length - 1; i++) {

            intercambio = false;

            for (int j = 0; j < brands.length - 1 - i; j++) {

                // DESCENDENTE
                if (brands[j].getTotalValidYears()
                        < brands[j + 1].getTotalValidYears()) {

                    // INTERCAMBIO
                    Brand aux = brands[j];
                    brands[j] = brands[j + 1];
                    brands[j + 1] = aux;

                    intercambio = true;
                }
            }

            // Bubble avanzado
            if (!intercambio) {
                break;
            }
        }

        return brands;
    }

    // BUSQUEDA BINARIA
    public Brand binarySearchByValidYears(
            Brand[] brands,
            int validYears,
            boolean isAscending
    ) {

        int inicio = 0;
        int fin = brands.length - 1;

        while (inicio <= fin) {

            int medio = (inicio + fin) / 2;

            int valorMedio =
                    brands[medio].getTotalValidYears();

            
            if (valorMedio == validYears) {
                return brands[medio];
            }

            
            if (isAscending) {

                if (validYears < valorMedio) {
                    fin = medio - 1;
                } else {
                    inicio = medio + 1;
                }

            } else {

                // SI ESTA DESCENDENTE
                if (validYears > valorMedio) {
                    fin = medio - 1;
                } else {
                    inicio = medio + 1;
                }
            }
        }

        return null;
    }
}
