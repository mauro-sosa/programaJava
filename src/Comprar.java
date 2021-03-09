
public class Comprar {
    
    
    String producto1, producto2;
    int valor1, valor2, descuento1, descuento2,descuento_total, monto_parcial, monto_final, final1, final2;

  
    public void Comprar ( String nombre, String descripcion, int cantidad, int valor_unitario, int monto_total, int monto_descuento) {   
    
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.descuento1=descuento1;
        this.descuento2=descuento2;
        this.descuento_total=descuento_total;
        this.monto_parcial=monto_parcial;
        this.monto_final=monto_final;
    
} 

    public void setProducto1(String producto1) {
        this.producto1 = producto1;
    }

    public void setProducto2(String producto2) {
        this.producto2 = producto2;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public void setDescuento1(int descuento1) {
        this.descuento1 = descuento1;
    }

    public void setDescuento2(int descuento2) {
        this.descuento2 = descuento2;
    }

    public void setDescuento_total(int descuento_total) {
        this.descuento_total = descuento_total;
    }

    public void setMonto_parcial(int monto_parcial) {
        this.monto_parcial = monto_parcial;
    }

    public void setMonto_final(int monto_final) {
        this.monto_final = monto_final;
    }

    public String getProducto1() {
        return producto1;
    }

    public String getProducto2() {
        return producto2;
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public int getDescuento1() {
        return descuento1;
    }

    public int getDescuento2() {
        return descuento2;
    }

    public int getDescuento_total() {
        return descuento_total;
    }

    public int getMonto_parcial() {
        return monto_parcial;
    }

    public int getMonto_final() {
        return monto_final;
    }
    
      public int getFinal1() {
        return final1;
    }

    public int getFinal2() {
        return final2;
    }
    
    
    
    public int calcular (int descuento1, int valor1){   // primer producto con descuento
    
    
    descuento1 = (valor1*5)/100;
    valor1=valor1-descuento1;
    return valor1;
    
    } 
    
    public int calcular2 (int descuento2, int valor2){   // segundo producto con descuento
    
    
    descuento2 = (valor2*8)/100;
    valor2=valor2-descuento2;
    return valor2;
    
    } 
    
     public int calcular3 (int valor1, int valor2){   // monto parcial sin descuento 
    
    
    monto_parcial = valor1+valor2;
   
    return monto_parcial;
    
    } 
    
    
    public int calcular4 (int valor1, int valor2){   
    
    
    descuento1 = (valor1*5)/100;
    valor1=valor1-descuento1;
    descuento2 = (valor2*8)/100;
    valor2=valor2-descuento2;
    monto_final= valor1+valor2;
    return monto_final;
    
    } 
    
    
    public int calcular5 (int valor1, int valor2){   // total de descuento
    
    
    descuento1 = (valor1*5)/100;
    valor1=valor1-descuento1;
    descuento2 = (valor2*8)/100;
    valor2=valor2-descuento2;
    monto_final= valor1+valor2;
    descuento_total=descuento1+descuento2;
    return descuento_total;
    
    } 
    
    
     public int calcular6 (int valor1, int valor2){   // final 1
    
    
   descuento1 = (valor1*5)/100;
    valor1=valor1-descuento1;
    descuento2 = (valor2*8)/100;
    valor2=valor2-descuento2;
    monto_final= valor1+valor2;
    final1=monto_final-(monto_final*12/100);
    return final1;
    
    } 
     
     
     public int calcular7 (int valor1, int valor2){   // final 1
    
    
   descuento1 = (valor1*5)/100;
    valor1=valor1-descuento1;
    descuento2 = (valor2*8)/100;
    valor2=valor2-descuento2;
    monto_final= valor1+valor2;
    final2=monto_final-(monto_final*7/100);
    return final2;
    
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
