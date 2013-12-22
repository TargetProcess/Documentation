package models

import org.eclipse.egit.github.core.{PullRequest=>PR}
import com.github.nscala_time.time.Imports._

case class PullRequest(name:String, id: Int, url: String, created:DateTime) {}

case class PullRequestStatus(isMergeable:Boolean, isMerged:Boolean)

object PullRequest{
  def create(pr:PR):PullRequest = PullRequest(pr.getHead.getRef, pr.getNumber, pr.getHtmlUrl, new DateTime(pr.getCreatedAt))
}
