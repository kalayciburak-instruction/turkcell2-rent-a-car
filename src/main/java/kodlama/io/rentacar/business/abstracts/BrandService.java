package kodlama.io.rentacar.business.abstracts;

import kodlama.io.rentacar.entities.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
    Brand getById(int id);
    Brand add(Brand brand);
    Brand update(int id, Brand brand);
    void delete(int id);
}
