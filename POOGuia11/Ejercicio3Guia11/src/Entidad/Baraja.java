/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Elba Aban
 */
public class Baraja {

    private Carta carta;
    private int cartaSiguiente;
    ArrayList<Carta> listaCartas = new ArrayList<>();
    ArrayList<Carta> monton = new ArrayList<>();

    public Baraja() {
        cartaSiguiente = 0;
        monton = new ArrayList<>();
        listaCartas = new ArrayList<>();
        String[] palos = {"espadas", "oro", "basto", "copa"};
        for (String palo : palos) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    listaCartas.add(new Carta(i, palo));
                }
            }
        }
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public int getCartaSiguiente() {
        return cartaSiguiente;
    }

    public void setCartaSiguiente(int cartaSiguiente) {
        this.cartaSiguiente = cartaSiguiente;
    }

    public ArrayList getListaCartas() {
        return listaCartas;
    }

    public void setListaCartas(ArrayList listaCartas) {
        this.listaCartas = listaCartas;
    }

    public ArrayList getMonton() {
        return monton;
    }

    public void setMonton(ArrayList monton) {
        this.monton = monton;
    }

    public void barajar() {
        Collections.shuffle(listaCartas);
        System.out.println("Sus cartas mezcladas");
        for (Carta listaCarta : listaCartas) {
            System.out.println(listaCarta);
        }
    }

    public Carta siguienteCarta() {
        if (cartaSiguiente >= listaCartas.size()) {
            System.out.println("Ya no hay mas cartas en la baraja");
            return null;
        }
        Carta carta = (Carta) listaCartas.get(cartaSiguiente);
        cartaSiguiente++;
        return carta;
    }

    public int cartasDisponibles() {
        return listaCartas.size() - cartaSiguiente;
    }

    public ArrayList<Carta> darCartas(int num) {
        if (num > cartasDisponibles()) {
            System.out.println("No hay suficientes cartas en la baraja");
            return null;
        } else {
            ArrayList<Carta> cartasPedidas = new ArrayList();
            for (int i = 1; i <= num; i++) {
                Carta carta = siguienteCarta();
                cartasPedidas.add(siguienteCarta());
                monton.add(carta);
            }

            for (Carta cartasPedida : cartasPedidas) {
                System.out.println(cartasPedida);
            }
            return cartasPedidas;
        }

    }

    public ArrayList<Carta> cartasMonton() {

        if (monton.isEmpty()) {
            System.out.println("No ha salido ninguna carta todavia");
            return null;
        } else {
            for (Carta carta : monton) {
                System.out.println(carta);

            }

        }
        return null;
    }

    public void mostrarBaraja() {
        if (listaCartas.isEmpty()) {
            System.out.println("Ya salieron todas la cartas, baraja vacia!!");
        } else {
            System.out.println("cartas restantes en la baraja");
            for (int i = cartaSiguiente; i < listaCartas.size(); i++) {
                System.out.println(listaCartas.get(i));
            }
        }
    }
}
