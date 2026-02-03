package technikal.task.fishmarket.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "fish_images")
public class FishImage {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String fileName;

  @ManyToOne
  @JoinColumn(name = "fish_id")
  private Fish fish;


  public FishImage() {
  }

  public FishImage(String fileName, Fish fish) {
    this.fileName = fileName;
    this.fish = fish;
  }

  //getters ad setters
  public Fish getFish() {
    return fish;
  }

  public void setFish(Fish fish) {
    this.fish = fish;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}

