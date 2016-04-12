/*
 *
 *  License Terms
 *
 *  Copyright (c) 2015, California Institute of Technology ("Caltech").
 *  U.S. Government sponsorship acknowledged.
 *
 *  Copyright (c) 2015, Airbus Operations S.A.S.
 *
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are
 *  met:
 *
 *
 *   *   Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *
 *   *   Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the
 *       distribution.
 *
 *   *   Neither the name of Caltech nor its operating division, the Jet
 *       Propulsion Laboratory, nor the names of its contributors may be
 *       used to endorse or promote products derived from this software
 *       without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 *  IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 *  TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 *  PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
 *  OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 *  EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 *  PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 *  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 *  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 *  SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.omg.oti.json.uml.enums

import play.json.extra._
import play.api.libs.json._

/**
  * ObjectNodeOrderingKind is an enumeration indicating queuing order for offering the tokens held by an ObjectNode.
  *
  * <!-- Start of user code documentation -->
  * <!-- End of user code documentation -->
  */
sealed trait UMLObjectNodeOrderingKind {}

object UMLObjectNodeOrderingKind {

  /**
    * Indicates that tokens are queued in a first in, first out manner.
    *
    * <!-- Start of user code doc for FIFO -->
    * <!-- End of user code doc for FIFO -->
    */
  case object FIFO extends UMLObjectNodeOrderingKind {}

  /**
    * Indicates that tokens are queued in a last in, first out manner.
    *
    * <!-- Start of user code doc for LIFO -->
    * <!-- End of user code doc for LIFO -->
    */
  case object LIFO extends UMLObjectNodeOrderingKind {}

  /**
    * Indicates that tokens are ordered.
    *
    * <!-- Start of user code doc for ordered -->
    * <!-- End of user code doc for ordered -->
    */
  case object ordered extends UMLObjectNodeOrderingKind {}

  /**
    * Indicates that tokens are unordered.
    *
    * <!-- Start of user code doc for unordered -->
    * <!-- End of user code doc for unordered -->
    */
  case object unordered extends UMLObjectNodeOrderingKind {}
 
  implicit val formatsUMLObjectNodeOrderingKind
  : Format[UMLObjectNodeOrderingKind]
  = Variants.format[UMLObjectNodeOrderingKind]
  
  implicit val writesUMLObjectNodeOrderingKind
  : Writes[UMLObjectNodeOrderingKind]
  = Variants.writes[UMLObjectNodeOrderingKind]

  implicit val readsUMLObjectNodeOrderingKind
  : Reads[UMLObjectNodeOrderingKind]
  = Variants.reads[UMLObjectNodeOrderingKind]
}
