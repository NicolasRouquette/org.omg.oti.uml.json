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
  * This is an enumerated type that identifies the type of Message.
  *
  * <!-- Start of user code documentation -->
  * <!-- End of user code documentation -->
  */
sealed trait UMLMessageKind {}

object UMLMessageKind {

  /**
    * sendEvent and receiveEvent are present
    *
    * <!-- Start of user code doc for complete -->
    * <!-- End of user code doc for complete -->
    */
  case object complete extends UMLMessageKind {}

  /**
    * sendEvent absent and receiveEvent present
    *
    * <!-- Start of user code doc for found -->
    * <!-- End of user code doc for found -->
    */
  case object found extends UMLMessageKind {}

  /**
    * sendEvent present and receiveEvent absent
    *
    * <!-- Start of user code doc for lost -->
    * <!-- End of user code doc for lost -->
    */
  case object lost extends UMLMessageKind {}

  /**
    * sendEvent and receiveEvent absent (should not appear)
    *
    * <!-- Start of user code doc for unknown -->
    * <!-- End of user code doc for unknown -->
    */
  case object unknown extends UMLMessageKind {}
 
  implicit val formatsUMLMessageKind
  : Format[UMLMessageKind]
  = Variants.format[UMLMessageKind]
  
  implicit val writesUMLMessageKind
  : Writes[UMLMessageKind]
  = Variants.writes[UMLMessageKind]

  implicit val readsUMLMessageKind
  : Reads[UMLMessageKind]
  = Variants.reads[UMLMessageKind]
}
