package aula08;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="calcular")
public class Calcular {
   private double x;
   private double y;
   private double total;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
   
    public void soma(){
        this.total = this.x + this.y;    
    }
    
    public void subtracao(){
        this.total = this.x - this.y;    
    }
    
    public void multiplicacao(){
        this.total = this.x * this.y;    
    }
    
    public void divisao(){
        this.total = this.x / this.y;    
    }  
    
}
