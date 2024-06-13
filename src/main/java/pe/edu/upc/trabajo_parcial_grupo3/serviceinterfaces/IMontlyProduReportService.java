package pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces;

import pe.edu.upc.trabajo_parcial_grupo3.entities.MonthlyProducctionReport;

import java.util.List;


public interface IMontlyProduReportService {
    public void insert (MonthlyProducctionReport monthlyProducctionReport);
    public List<MonthlyProducctionReport> list();

}
