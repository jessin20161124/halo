package run.halo.app.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@Entity
@Table(name = "client_post_visit", indexes = {@Index(name = "uniq_client_ip_post_id", columnList = "client_ip,post_id", unique = true)})
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientPostVisit extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "custom-id")
    @GenericGenerator(name = "custom-id",
        strategy = "run.halo.app.model.entity.support.CustomIdGenerator")
    private Long id;

    @Column(name = "client_ip", length = 127, nullable = false)
    private String clientIp;

    /**
     * Post visits.
     */
    @Column(name = "post_id")
    @ColumnDefault("0")
    private Integer postId;

}