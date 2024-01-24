package com.trybe.acc.java;

/**
 * Método principal.
 */

public class Caminhao extends VeiculoBase {

  /**
   * Atributos e Métodos.
   */

  private double capacidadeCarga;

  public Caminhao(
      String marca,
      String modelo,
      int ano, String
      tipoCombustivel,
      int capacidadeTanque,
      double capacidadeCarga
  ) {
    super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);
    this.capacidadeCarga = capacidadeCarga;
  }

  @Override
  public double calcularConsumoCombustivel(double distancia) {
    return distancia / 6;
  }

  @Override
  public void exibirInformacoes() {
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Ano: " + getAno());
    System.out.println("Tipo de combustível: " + getTipoCombustivel());
    System.out.println("Capacidade do tanque: " + getCapacidadeTanque() + " litros");
    System.out.println("Capacidade de carga: " + getCapacidadeCarga() + " kg");
  }

  //   getters e setters

  public double getCapacidadeCarga() {
    return capacidadeCarga;
  }

  public void setCapacidadeCarga(double capacidadeCarga) {
    this.capacidadeCarga = capacidadeCarga;
  }
}
