/**
 * 
 */
package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Note;

/**
 * @author Sanket
 *
 */
public interface NoteRepository extends CrudRepository<Note, Long> {

}
