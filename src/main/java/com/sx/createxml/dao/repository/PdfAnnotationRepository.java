package com.sx.createxml.dao.repository;

import com.sx.createxml.pojo.mysql.PdfAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author sunxu93@163.com
 * @date 19/10/15/015 17:22
 */
public interface PdfAnnotationRepository extends JpaRepository<PdfAnnotation, Long> {

    @Query(value = " select * from teamcore_pdf_annotation where url like :gitlabId and url like :signedFilePath ",
            nativeQuery =
            true)
    @Modifying
    @Transactional
    List<PdfAnnotation> findByGitlabIdAndSignedFilePath(@Param("gitlabId") String gitlabId,
                                                        @Param("signedFilePath") String signedFilePath);

    List<PdfAnnotation> findByUrlLikeAndUrlLike(@Param("gitlabId") String gitlabId,
                                                @Param("signedFileName") String signedFileName);


    @Query(value = " select * from teamcore_pdf_annotation where author like :author",
            nativeQuery =
                    true)
    @Modifying
    @Transactional
    List<PdfAnnotation> findByAuthor(@Param("author") String author);


    List<PdfAnnotation> findByAuthorLike(String author);
}
