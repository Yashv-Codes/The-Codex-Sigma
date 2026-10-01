import java.util.Scanner;

class Complex {
    int real;
    int imag;

    // Constructor to initialize real and imaginary parts
    Complex(int r, int i) {
        this.real = r;
        this.imag = i;
    }

    // Method to add two complex numbers: (a + c) + (b + d)i
    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imag + c2.imag);
    }

    // Method to subtract two complex numbers: (a - c) + (b - d)i
    public static Complex diff(Complex c1, Complex c2) {
        return new Complex(c1.real - c2.real, c1.imag - c2.imag);
    }

    // Method to multiply two complex numbers: (ac - bd) + (ad + bc)i
    public static Complex product(Complex c1, Complex c2) {
        int r = (c1.real * c2.real) - (c1.imag * c2.imag);
        int i = (c1.real * c2.imag) + (c1.imag * c2.real);
        return new Complex(r, i);
    }

    // Method to print in standard a + bi or a - bi format
    public void printComplex() {
        if (imag >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            System.out.println(real + " - " + (-imag) + "i");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first complex number
        System.out.print("Enter real and imaginary part of first complex number: ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

        // Input for second complex number
        System.out.print("Enter real and imaginary part of second complex number: ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

        // Perform operations
        Complex sumResult = Complex.add(c1, c2);
        Complex diffResult = Complex.diff(c1, c2);
        Complex prodResult = Complex.product(c1, c2);

        // Display results
        System.out.print("Sum: ");
        sumResult.printComplex();

        System.out.print("Difference: ");
        diffResult.printComplex();

        System.out.print("Product: ");
        prodResult.printComplex();

        sc.close();
    }
}






        

        
    
    
    

        
        
        
                          
        
        
        
        
        
        
        
        
        
        
    


    

