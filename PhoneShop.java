/*

For this task, I am required to create a simulation of an online web shop. My shop will be mainly selling smartphones.
For this task, the customer should also be able make a choice between a range of products, the customer also has the option to buy multiple same products.
The web shop will continue to run until the customer presses number 0. This will end the program and state the total costs of the shopping the customer has done.
 */


package Phone.shop.pkg3;
import java.util.Scanner; // The first step I did for this project was to implement the scanner feature. This would enable the user input to be implemented and read.

public class PhoneShop {
 

public static void main(String[] args) {
       Scanner webshop = new Scanner (System.in);
       
 System.out.println(" Welcome to your local phone store"); // Here, I have used the System.out.println method, to welcome the customer to my web shop.
 
 
 //Here below, I have created a list of five products that we have for sale, this also includes the prices. The customer is able to do their shopping by referring to this list.
 
 System.out.println("Product 1: Iphone SE Price:£399"); 
             
 System.out.println("Product 2: Iphone XR Price:£499"); 
        
 System.out.println("Product 3: Iphone 11 Price: £599"); 
        
 System.out.println("Product 4: Iphone 12 Pro Max Price:£1099"); 
 
 System.out.println("Product 5: Airpods Price:£159 "); 
 
int total = 0; // Here, I have declared the value of the integer number.


System.out.println("Enter the price of the product you would like to buy. If you require multiple same products, then enter the price again, or enter 0 to finish your shopping: "); int nextNumber = webshop.nextInt(); // Here I am providing instructions to the customer, this has been done via the System.out.println method. I have also declared the integer type data here, because the customer would be required to input the price, to be able to choose what product they want. They can also select the same product more than once, by entering the price again.
while (nextNumber != 0) { //Here, I have declared that if the customer enters number 0, the program should stop running.
if (nextNumber == 399) { //Here, I have declared the first price of the product, as this involves numbers. I have used nextNumber.
System.out.println("Your selected product is: Iphone SE"); } // Once the customer would enter the price of 399, it would display to them that they have selected this product. This would be added to their shopping cart.

else if (nextNumber == 499) { //Here, I have used an else if statement. So, if the customer enters the price of 499, the product with this price would display. As this also involves numbers, I have used nextNumber.
System.out.println("Your selected product is: Iphone XR"); } // Once the customer would enter the price of 499, it would display to them that they have selected this product, this would work via System.out.println. This product would also be added to their shopping cart.

else if (nextNumber == 599) { //Here, I have used another else if statement. So, if the customer enters the price of 599, the product with this price would display. As this also involves numbers, I have used nextNumber to declare the price.
System.out.println("Your selected product is :Iphone 11"); } // Once the customer would enter the price of 599, it would display to them that they have selected this product, this would work via System.out.println. This product would also be added to their final shopping cart.

else if (nextNumber==1099) { //Here, I have used another else if statement. So, if the customer enters the price of 1099, the product with this price would display. As this also involves numbers, I have used nextNumber to declare the price.
System.out.println("Your selected product is :Iphone 12 Pro max"); } //Once the customer would enter the price of 1099, it would display to them that they have selected this product, this would work via System.out.println. This product would also be added to their final shopping cart.

else if (nextNumber== 159) { //Here, I have used another else if statement. So, if the customer enters the price of 159, the product with this price would display. As this also involves numbers, I have used nextNumber to declare the price.
    System.out.println("Your selected product is :Airpods"); //Once the customer would enter the price of 159 and it matches with the price list, then it would display to them that they have selected this product, this would work via System.out.println. This product would also be added to their final shopping cart.
}

total = total + nextNumber; //This is the formula I have used, for the purpose to find the total price of the shopping. 
System.out.println("Enter the price of your chosen product, or 0 to finish your shopping: "); //Once the customer would have selected a product, this instructions message will display, giving the customer two options.
nextNumber = webshop.nextInt(); }
System.out.println("The total costs of your selected products are £ " + total); //This will be the statement that will be displayed when the customer has pressed 0 to terminate the program. This will be done via System.out.println. This will show to them how much their total shopping has been.


System.out.println("Thank you very much for shopping with us today!"); //This will be the final line, which will be stating to the customer that their shopping is done. This would also be displayed via System.out.println.
 
    
 
    }
    
}
