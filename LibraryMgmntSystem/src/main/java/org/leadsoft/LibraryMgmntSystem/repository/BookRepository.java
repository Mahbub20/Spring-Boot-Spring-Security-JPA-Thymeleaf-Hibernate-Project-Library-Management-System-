package org.leadsoft.LibraryMgmntSystem.repository;

import org.leadsoft.LibraryMgmntSystem.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BookRepository extends CrudRepository<Book, Long> {

}
