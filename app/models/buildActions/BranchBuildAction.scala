package models.buildActions

import models.cycles.Cycle

case class BranchBuildAction(branch: String, cycle: Cycle) extends CycleAwareJenkinsBuildAction {
  val branchName: String = s"origin/$branch"
  val name = s"Build ${cycle.name} on branch"
}


