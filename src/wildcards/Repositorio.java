package wildcards;

import java.util.List;

public class Repositorio {
    public static <T> T buscarPorId(List<? extends T> lista, int id){
        for(T obj : lista) {
            if(obj.equals(id)) {
                return obj;
            }
        }
        return null;
    }
}
