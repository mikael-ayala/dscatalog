package com.devsuperior.dscatalog.util;

import com.devsuperior.dscatalog.entities.Product;
import com.devsuperior.dscatalog.projections.IdProjection;
import com.devsuperior.dscatalog.projections.ProductProjection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {

    public static <ID> List<? extends IdProjection<ID>> replace(List<? extends IdProjection<ID>> ordered,
                                                                List<? extends IdProjection<ID>> unordered) {
        Map<ID, IdProjection<ID>> map = new HashMap<>();
        for (IdProjection<ID> product : unordered) {
            map.put(product.getId(), product);
        }

        List<IdProjection<ID>> result = new ArrayList<>();
        for (IdProjection<ID> projection : ordered) {
            result.add(map.get(projection.getId()));
        }

        return result;
    }
}
