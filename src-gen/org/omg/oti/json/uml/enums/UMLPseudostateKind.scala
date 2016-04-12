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
  * PseudostateKind is an Enumeration type that is used to differentiate various kinds of Pseudostates.
  *
  * <!-- Start of user code documentation -->
  * <!-- End of user code documentation -->
  */
sealed trait UMLPseudostateKind {}

object UMLPseudostateKind {

  /**
    * 
    *
    * <!-- Start of user code doc for choice -->
    * <!-- End of user code doc for choice -->
    */
  case object choice extends UMLPseudostateKind {}

  /**
    * 
    *
    * <!-- Start of user code doc for deepHistory -->
    * <!-- End of user code doc for deepHistory -->
    */
  case object deepHistory extends UMLPseudostateKind {}

  /**
    * 
    *
    * <!-- Start of user code doc for entryPoint -->
    * <!-- End of user code doc for entryPoint -->
    */
  case object entryPoint extends UMLPseudostateKind {}

  /**
    * 
    *
    * <!-- Start of user code doc for exitPoint -->
    * <!-- End of user code doc for exitPoint -->
    */
  case object exitPoint extends UMLPseudostateKind {}

  /**
    * 
    *
    * <!-- Start of user code doc for fork -->
    * <!-- End of user code doc for fork -->
    */
  case object fork extends UMLPseudostateKind {}

  /**
    * 
    *
    * <!-- Start of user code doc for initial -->
    * <!-- End of user code doc for initial -->
    */
  case object initial extends UMLPseudostateKind {}

  /**
    * 
    *
    * <!-- Start of user code doc for join -->
    * <!-- End of user code doc for join -->
    */
  case object join extends UMLPseudostateKind {}

  /**
    * 
    *
    * <!-- Start of user code doc for junction -->
    * <!-- End of user code doc for junction -->
    */
  case object junction extends UMLPseudostateKind {}

  /**
    * 
    *
    * <!-- Start of user code doc for shallowHistory -->
    * <!-- End of user code doc for shallowHistory -->
    */
  case object shallowHistory extends UMLPseudostateKind {}

  /**
    * 
    *
    * <!-- Start of user code doc for terminate -->
    * <!-- End of user code doc for terminate -->
    */
  case object terminate extends UMLPseudostateKind {}
 
  implicit val formatsUMLPseudostateKind
  : Format[UMLPseudostateKind]
  = Variants.format[UMLPseudostateKind]
  
  implicit val writesUMLPseudostateKind
  : Writes[UMLPseudostateKind]
  = Variants.writes[UMLPseudostateKind]

  implicit val readsUMLPseudostateKind
  : Reads[UMLPseudostateKind]
  = Variants.reads[UMLPseudostateKind]
}
