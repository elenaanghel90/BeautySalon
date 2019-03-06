package com.github.elenaanghel90.beautysalon.model;

import java.util.Arrays;
import java.util.List;

import static com.github.elenaanghel90.beautysalon.model.TipServiciu.*;

public enum CategorieServiciu {

    COSMETICA(Arrays.asList(EPILAT, PENSAT, TRATAMENT_FACIAL)),
    //COSMETICA(Arrays.asList(TipServiciu.EPILAT, TipServiciu.PENSAT, TipServiciu.TRATAMENT_FACIAL)
    COAFOR(Arrays.asList(TUNS, SPALAT,COAFAT, VOPSIT)),
    MANICHIURA(Arrays.asList(CURATAT_UNGHII,APLICARE_SEMIPERMANENTA,APLICARE_GEL,MODEL_UNGHIE));

    private List<TipServiciu> tipuriServicii;

    CategorieServiciu(List<TipServiciu> tipuriServicii) {
        this.tipuriServicii = tipuriServicii;
    }
    public List<TipServiciu> getTipuriServicii() {
        return tipuriServicii;
    }
}
