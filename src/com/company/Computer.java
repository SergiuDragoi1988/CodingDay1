package com.company;

import javafx.util.converter.PercentageStringConverter;
import model.*;

public class Computer {

   private GraphicCard graphicCard;
   private Memory memory;
   private Peripheral peripheral;
   private Motherboard motherboard;
   private Processor processor;

   private String producer;
   private String generation;

   public GraphicCard getGraphicCard() {
      return graphicCard;
   }

   public void setGraphicCard(GraphicCard graphicCard) {
      this.graphicCard = graphicCard;
   }

   public Memory getMemory() {
      return memory;
   }

   public void setMemory(Memory memory) {
      this.memory = memory;
   }

   public Peripheral getPeripheral() {
      return peripheral;
   }

   public void setPeripheral(Peripheral peripheral) {
      this.peripheral = peripheral;
   }

   public Motherboard getMotherboard() {
      return motherboard;
   }

   public void setMotherboard(Motherboard motherboard) {
      this.motherboard = motherboard;
   }

   public Processor getProcessor() {
      return processor;
   }

   public void setProcessor(Processor processor) {
      this.processor = processor;
   }

   public String getProducer() {
      return producer;
   }

   public void setProducer(String producer) {
      this.producer = producer;
   }

   public String getGeneration() {
      return generation;
   }

   public void setGeneration(String generation) {
      this.generation = generation;
   }

}
