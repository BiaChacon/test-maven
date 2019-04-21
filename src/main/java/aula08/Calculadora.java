package aula08;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="cal")
public class Calculadora {
    
    String conta = new String("");
    String total = "0.0";

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
    
    /*public void del(){
        conta = "";
    }*/

    public void num(String n){
        this.conta = this.conta.concat(n);
    }
    
    /*public void operation(String f){
       String[] ope = conta.split("[]");
    }*/
   
    
}
