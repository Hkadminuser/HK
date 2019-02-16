package njhk.wisdom.web.bean.entity.relevance;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import njhk.wisdom.web.bean.common.persistence.DataEntity;
@Getter
@Setter
@ToString
public class ServetypeServeperson extends DataEntity<ServetypeServeperson> {

     private  String servetype_id;//服务内容ID
     private  String serveperson_id;//服务人员ID
}
