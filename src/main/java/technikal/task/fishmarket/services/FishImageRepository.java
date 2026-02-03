package technikal.task.fishmarket.services;

import org.springframework.data.jpa.repository.JpaRepository;
import technikal.task.fishmarket.models.FishImage;

public interface FishImageRepository extends JpaRepository<FishImage, Long> {
}