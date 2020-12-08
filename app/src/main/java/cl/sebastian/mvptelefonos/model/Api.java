package cl.sebastian.mvptelefonos.model;




import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {
     @GET("products")
     Call<List<Telefonos>> getTelefonos();
    @GET("details/{id}")
    Call <DetalleProducto> getDetail(@Path("id") int id);

}
