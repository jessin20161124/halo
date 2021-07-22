package run.halo.app.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import run.halo.app.model.entity.Attachment;
import run.halo.app.model.entity.ClientPostVisit;
import run.halo.app.model.enums.AttachmentType;
import run.halo.app.repository.base.BaseRepository;
import java.util.List;

public interface ClientPostVisitRepository
    extends BaseRepository<ClientPostVisit, Integer>, JpaSpecificationExecutor<ClientPostVisit> {

    // boolean exist(String clientIp, Integer postId);
}
