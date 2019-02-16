package njhk.wisdom.web.service.mapper.service;

import njhk.wisdom.web.bean.entity.server.ServiceStates;
import njhk.wisdom.web.bean.entity.relevance.WxServicepgdServeperson;
import njhk.wisdom.web.bean.entity.server.ServicePgd;
import njhk.wisdom.web.service.base.CrudDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ServicePgdDao extends CrudDao<ServicePgd> {
    List<ServicePgd> findServicepgdByServepersonID(WxServicepgdServeperson wss);

    void batchDeleteServicepgd(ServicePgd servicePgd);

    void batchWithdraw(ServicePgd servicePgd);

    void batchHandle(ServicePgd servicePgd);

    void batchReturnVisit(ServicePgd servicePgd);

    void batchToVoid(ServicePgd servicePgd);

    List<ServiceStates> findServicePgdStates();

    String findeOrderNumByOrderNum(String orderNum);

    void Distribute(ServicePgd servicePgd);

    void Invalid(ServicePgd servicePgd);

    void End(ServicePgd servicePgd);

    void Handle(ServicePgd servicePgd);

    void withdraw(ServicePgd servicePgd);

    void Visit(ServicePgd servicePgd);

    void start(ServicePgd servicePgd);

    void over(ServicePgd servicePgd);
}
