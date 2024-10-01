public class HistoriaClinica {
    
    private String anamnesis;
    private String formulaOptica;
    private String medicamento;
    
    public HistoriaClinica(String anamnesis, String formulaOptica, String medicamento) {
        this.anamnesis = anamnesis;
        this.formulaOptica = formulaOptica;
        this.medicamento = medicamento;
    }

    public String getAnamnesis() {
        return anamnesis;
    }

    public void setAnamnesis(String anamnesis) {
        this.anamnesis = anamnesis;
    }

    public String getFormulaOptica() {
        return formulaOptica;
    }

    public void setFormulaOptica(String formulaOptica) {
        this.formulaOptica = formulaOptica;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    @Override
    public String toString() {
        return "HistoriaClinica [anamnesis=" + anamnesis + ", formulaOptica=" + formulaOptica + ", medicamento="
                + medicamento + "]";
    }
    

}
