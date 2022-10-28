package kodlama.io.rentacar.dataAccess.concretes;

import kodlama.io.rentacar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> listBrands;

    public InMemoryBrandRepository() {
        listBrands=new ArrayList<Brand>();
        listBrands.add(new Brand(1,"BMW"));
        listBrands.add(new Brand(2,"Mercedes"));
        listBrands.add(new Brand(3,"Audi"));
        listBrands.add(new Brand(4,"Fiat"));
        listBrands.add(new Brand(5,"Reno"));
    }


    @Override
    public List<Brand> getAll() {
        return listBrands;
    }
}
