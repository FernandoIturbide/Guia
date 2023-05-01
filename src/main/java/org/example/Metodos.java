package org.example;

public class Metodos {
    public String Escoger(int numero){
        String string="";
        switch (numero) {
            case 1:
                string="Caja";
                break;
            case 2:
                string="Banco";
                break;
            case 3:
                string="Inversiones temporales";
                break;
            case 4:
                string="Clientes";
                break;
            case 5:
                string="Deudores diversos";
                break;
            case 6:
                string="Documentos por cobrar";
                break;
            case 7:
                string="Inventario";
                break;
            case 8:
                string="Pagos anticipados";
                break;
            case 9:
                string="Terreno";
                break;
            case 10:
                string="Edificio";
                break;
            case 11:
                string="Mobiliario y equipo de oficina";
                break;
            case 12:
                string="Equipo de transporte";
                break;
            case 13:
                string="Equipo de computo";
                break;
            case 14:
                string="Patentes y marcas";
                break;
            case 15:
                string="Proveedores";
                break;
            case 16:
                string="Acreedores diversos";
                break;
            case 17:
                string="Documentos por pagar";
                break;
            case 18:
                string="Prestamos bancarios";
                break;
            case 19:
                string="Anticipo clientes";
                break;
            case 20:
                string="Documentos por pagar a Largo Plazo";
                break;
            case 21:
                string="Prestamos bancarios a Largo Plazo";
                break;
            case 22:
                string="Prestamo hipotecario";
                break;
            case 23:
                string="Capital social";
                break;
            case 24:
                string="Utilidades acumuladas";
                break;
            case 25:
                string="Utilidades del ejercicio";
                break;
            default:
                break;
        }
        return string;
    }
    public void Mensaje(String mensaje){
        System.out.println(mensaje);
    }
    public void opciones(){
        System.out.println("Ingrese una de las siguientes opciones:\n(1) Activo circulante\n(2) Activo no circulante\n(3) Pasivo a corto plazo\n(4) Pasivo a largo plazo\n(5) Capital contable");
    }
    public void opciones2(){
        System.out.println("Ingrese una de las siguientes opciones: \n(1) Contrtibuido\n(2) Ganado");
    }
    public int Conversion(int numero){
        if (numero>=1 && numero<=8){
            return 1;
        } else if (numero>=9&&numero<=14) {
            return 2;
        } else if (numero>=15&&numero<=19) {
            return 3;
        }else if (numero>=20&&numero<=22){
            return 4;
        }else if (numero==23){
            return 1;
        }else if (numero>=24&&numero<=25){
            return 2;
        }
        return 0;
    }
}
