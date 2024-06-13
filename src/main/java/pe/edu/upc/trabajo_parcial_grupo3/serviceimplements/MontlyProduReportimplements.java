package pe.edu.upc.trabajo_parcial_grupo3.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trabajo_parcial_grupo3.entities.MonthlyProducctionReport;
import pe.edu.upc.trabajo_parcial_grupo3.repositorio.IMontlyProduReport;
import pe.edu.upc.trabajo_parcial_grupo3.serviceinterfaces.IMontlyProduReportService;
import java.util.List;

@Service
public class MontlyProduReportimplements implements IMontlyProduReportService {
    @Autowired
    private IMontlyProduReport rR;

    @Override
    public void insert(MonthlyProducctionReport monthlyProducctionReport) {
        rR.save(monthlyProducctionReport);
    }

    @Override
    public List<MonthlyProducctionReport> list() {
        return rR.findAll();
    }



}
