package aula08;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Calculadora {
	
	String conta = new String ("");
	
	public void num(String num) {
		this.conta = this.conta.concat(num);
	}
	
	public void operacao (String func) {
		
		String[] operacao = conta.split("[-+*/]");
		
		try {
			if (conta.contains("+")){
				resolverOp(operacao[0], operacao[1], "+", func);
			}else if (conta.contains("-")){
				resolverOp(operacao[0], operacao[1], "-", func);
			}else if (conta.contains("/")){
				resolverOp(operacao[0], operacao[1], "/", func);
			}else if (conta.contains("*")){
				resolverOp(operacao[0], operacao[1], "*", func);
			}else{
				if (func.equals("=")){
					conta = "0";
				}else{
					this.conta = this.conta.concat(func);
				}
			}
		} catch (Exception e) {
			conta = "0";
			//e.printStackTrace();
		}
	}
	
	public void resolverOp(String num1, String num2, String operador, String nextoperador){
		
		System.out.println("Resolver: " + num1 + operador +num2);
		
		int result = 0;
		
		if (operador.equals("+")){
			result = Integer.parseInt(num1) + Integer.parseInt(num2);
		}else if (operador.equals("-")){
			result = Integer.parseInt(num1) - Integer.parseInt(num2);
		}else if (operador.equals("*")){
			result = Integer.parseInt(num1) * Integer.parseInt(num2);
		}else if (operador.equals("/")){
			result = Integer.parseInt(num1) / Integer.parseInt(num2);
		}else if (operador.equals("/")){
			result = Integer.parseInt(num1) / Integer.parseInt(num2);
		}
		if(nextoperador.equals("=")){
			this.conta = ""+ result;
		}else{
			this.conta = "" +result+nextoperador;
		}

	}
        
        public void del() {
            this.conta = "0";
        }
        
        public String getConta() {
            return conta;
        }

        public void setConta(String conta) {
            this.conta = conta;
        }
	
}
