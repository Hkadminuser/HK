package njhk.wisdom.web.service.impl.service;

import njhk.wisdom.web.bean.entity.server.ServiceStates;
import njhk.wisdom.web.bean.entity.relevance.WxServicepgdServeperson;
import njhk.wisdom.web.bean.entity.server.ServicePgd;
import njhk.wisdom.web.service.base.CrudService;
import njhk.wisdom.web.service.mapper.service.ServicePgdDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(readOnly = false)
public class ServicePgdService extends CrudService<ServicePgdDao, ServicePgd> {
    @Resource
    private  ServicePgdDao servicePgdDao;
    public List<ServicePgd> findServicepgdByServepersonID(WxServicepgdServeperson wss) {
        return servicePgdDao.findServicepgdByServepersonID(wss);
    }

    public void batchDeleteServicepgd(ServicePgd servicePgd) {
        servicePgdDao.batchDeleteServicepgd(servicePgd);
    }

    public void batchWithdraw(ServicePgd servicePgd) {
        servicePgdDao.batchWithdraw(servicePgd);
    }

    public void batchHandle(ServicePgd servicePgd) {
        servicePgdDao.batchHandle(servicePgd);
    }

    public void batchReturnVisit(ServicePgd servicePgd) {
        servicePgdDao.batchReturnVisit(servicePgd);
    }

    public void batchToVoid(ServicePgd servicePgd) {
        servicePgdDao.batchToVoid(servicePgd);
    }

    public List<ServiceStates> findServicePgdStates() {
        return  servicePgdDao.findServicePgdStates();
    }

    public String findeOrderNumByOrderNum(String orderNum) {return servicePgdDao.findeOrderNumByOrderNum(orderNum);}

    public void Distribute(ServicePgd servicePgd) { servicePgdDao.Distribute(servicePgd);}

    public void Invalid(ServicePgd servicePgd) {servicePgdDao.Invalid(servicePgd);}

    public void End(ServicePgd servicePgd) {servicePgdDao.End(servicePgd);}

    public void Handle(ServicePgd servicePgd) {servicePgdDao.Handle(servicePgd);}

    public void withdraw(ServicePgd servicePgd) {servicePgdDao.withdraw(servicePgd);}

    public void Visit(ServicePgd servicePgd) {servicePgdDao.Visit(servicePgd);}

    public void start(ServicePgd servicePgd) {servicePgdDao.start(servicePgd);}

    public void over(ServicePgd servicePgd) {servicePgdDao.over(servicePgd);}
}
