package org.semanticweb.owlapi.model;

import java.util.Set;

/** An interface to an object that has a signature and can provide the classes
 * that are contained in its signature.
 * 
 * @author Matthew Horridge, Stanford University, Bio-Medical Informatics
 *         Research Group, Date: 29/07/2013 */
public interface HasClassesInSignature {
    /** Gets the classes in the signature of this object.
     * 
     * @return A set containing the classes that are in the signature of this
     *         object. The set is a subset of the signature, and is not backed
     *         by the signature; it is a modifiable collection and changes are
     *         not reflected by the signature. */
    Set<OWLClass> getClassesInSignature();
}
