package com.trybe.acc.java;

/**
 * Método principal.
 */

public class Moto extends VeiculoBase {

  /**
   * Atributos e Métodos.
   */
  private String tipoMoto;

  public Moto(
      String marca,
      String modelo,
      int ano, String
      tipoCombustivel,
      int capacidadeTanque,
      String tipoMoto
  ) {
    super(marca, modelo, ano, tipoCombustivel, capacidadeTanque);
    this.tipoMoto = tipoMoto;
  }

  @Override
  public double calcularConsumoCombustivel(double distancia) {
    return distancia / 18;
  }

  @Override
  public void exibirInformacoes() {
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Ano: " + getAno());
    System.out.println("Tipo de combustível: " + getTipoCombustivel());
    System.out.println("Capacidade do tanque: " + getCapacidadeTanque() + " litros");
    System.out.println("Tipo da moto: " + getTipoMoto());
  }

  //  getters e setters
  public String getTipoMoto() {
    return tipoMoto;
  }

  public void setTipoMoto(String tipoMoto) {
    this.tipoMoto = tipoMoto;
  }
}
