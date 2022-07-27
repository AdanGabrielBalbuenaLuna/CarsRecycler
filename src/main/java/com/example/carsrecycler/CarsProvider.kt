package com.example.carsrecycler

class CarsProvider {
    companion object{
        val carList = listOf<Car>(
            Car(
                "BMW",
                "5 Series",
                "2006",
                4,
                "Grey",
                "24950f"
            ),
            Car(
                "Renault",
                "Laguna",
                "2000",
                5,
                "Red",
                "3995f"
            ),
            Car(
                "Toyota",
                "Previa",
                "1998",
                5,
                "Green",
                "2695f"
            ),
            Car(
                "Mini",
                "Cooper",
                "2005",
                2,
                "Grey",
                "9850f"
            ),
            Car(
                "Mazda",
                "MX 5",
                "2003",
                2,
                "Silver",
                "6995f"
            ),
            Car(
                "Ford",
                "Fiesta",
                "2004",
                3,
                "Red",
                "3759f"
            ),
            Car(
                "Honda",
                "Accord",
                "1997",
                4,
                "Silver",
                "1995f"
            )
        )
    }
}