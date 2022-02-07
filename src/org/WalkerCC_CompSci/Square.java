package org.WalkerCC_CompSci;

public final class Square extends Rectangle{

    public Square(double sideLength) {
        super(sideLength, sideLength);  //What goes here?

    }

    public double getSideLength(){
        return this.length;
    }

    public void setSideLength(double width){
       this.length = width;
       this.width = width;
    }


}
