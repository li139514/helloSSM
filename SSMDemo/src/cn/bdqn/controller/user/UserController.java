package cn.bdqn.controller.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.bdqn.pojo.User;
import cn.bdqn.service.user.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	  public void setUserService(UserService userService) { this.userService =
	  userService; }
	 
	@RequestMapping("/all.do")
	public ModelAndView selectByAll() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("userList", userService.selectByAll());
		mav.setViewName("index");
		return mav;
	}
	
	
	@RequestMapping("/delete.do")
	public void deleteById(@RequestParam("id")int id,HttpServletResponse resp) throws Exception {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		if(id>0) {
			Integer result =userService.deleteById(id);
			PrintWriter out=resp.getWriter();
			if(result>0) {
				out.print("<script>alert('删除成功');location.href='all.do'</script>");
			}else {
				out.print("<script>alert('删除失败');location.href='all.do'</script>");
			}
		}else {
			resp.sendRedirect("all.do");
		}
	}
	
	
	  @RequestMapping("/selectById.do")
	  public ModelAndView selectById(@RequestParam("id")int id) {
		  ModelAndView mav=new ModelAndView();
		  mav.addObject("user", userService.selectById(id));
		  mav.setViewName("update");
	  return mav;
	  }
	  
	  
	  @RequestMapping(value="/updateById.do",method= RequestMethod.POST)
	  public void updateById(User user,HttpServletResponse resp)throws Exception { 
		  resp.setCharacterEncoding("UTF-8");
		  resp.setContentType("text/html;charset=utf-8");
		  int result=userService.updateById(user);
		  PrintWriter out=resp.getWriter();
		  if(result>0) {
			  out.print("<script>alert('修改成功');location.href='all.do'</script>"); }
		  else {
			  out.print("<script>alert('修改失败');location.href='all.do'</script>"); }
	  }
	 
	  
	  @RequestMapping("/add.do")
	  public String add() {
		  return "add";
	  }
	  
	  @RequestMapping(value="/toadd.do",method= RequestMethod.POST)
	  public void toadd(User user,HttpServletResponse resp) throws IOException {
		  resp.setCharacterEncoding("UTF-8");
		  resp.setContentType("text/html;charset=utf-8");
		  int result=userService.toadd(user);
		  PrintWriter out=resp.getWriter();
		  if(result>0) {
			  out.print("<script>alert('添加成功');location.href='all.do'</script>"); }
		  else {
			  out.print("<script>alert('添加失败');location.href='all.do'</script>"); }
	  }
}
