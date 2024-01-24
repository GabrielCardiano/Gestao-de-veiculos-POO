package com.trybe.acc.java;

/**
 * Método principal.
 */

public class Carro extends VeiculoBase {

  /**
   * Atributos e Métodos.
   */
  private int numPassageiros;

  public Carro(
      String marca,
      String modelo,
      int ano, String
      tipoCombustivel,
      int capacidadeTanque,
      int numPassageiros
  ) {
    super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);
    this.numPassageiros = numPassageiros;
  }

  @Override
  public double calcularConsumoCombustivel(double distancia) {
    return distancia / 10;
  }

  @Override
  public void exibirInformacoes() {
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Ano: " + getAno());
    System.out.println("Tipo de combustível: " + getTipoCombustivel());
    System.out.println("Capacidade do tanque: " + getTipoCombustivel() + " litros");
    System.out.println("Número de passageiros: " + getNumPassageiros());
  }

  //  getters e setters

  public int getNumPassageiros() {
    return numPassageiros;
  }

  public void setNumPassageiros(int numPassageiros) {
    this.numPassageiros = numPassageiros;
  }
}
