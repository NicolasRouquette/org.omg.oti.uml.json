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
  * AggregationKind is an Enumeration for specifying the kind of aggregation of a Property.
  *
  * <!-- Start of user code documentation -->
  * <!-- End of user code documentation -->
  */
sealed trait UMLAggregationKind {}

object UMLAggregationKind {

  /**
    * Indicates that the Property is aggregated compositely, i.e., the composite object has responsibility for the existence and storage of the composed objects (parts).
    *
    * <!-- Start of user code doc for composite -->
    * <!-- End of user code doc for composite -->
    */
  case object composite extends UMLAggregationKind {}

  /**
    * Indicates that the Property has no aggregation.
    *
    * <!-- Start of user code doc for none -->
    * <!-- End of user code doc for none -->
    */
  case object none extends UMLAggregationKind {}

  /**
    * Indicates that the Property has shared aggregation.
    *
    * <!-- Start of user code doc for shared -->
    * <!-- End of user code doc for shared -->
    */
  case object shared extends UMLAggregationKind {}
 
  implicit val formatsUMLAggregationKind
  : Format[UMLAggregationKind]
  = Variants.format[UMLAggregationKind]
  
  implicit val writesUMLAggregationKind
  : Writes[UMLAggregationKind]
  = Variants.writes[UMLAggregationKind]

  implicit val readsUMLAggregationKind
  : Reads[UMLAggregationKind]
  = Variants.reads[UMLAggregationKind]
}
